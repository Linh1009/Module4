package codegym.vn.controller;

import codegym.vn.entity.Nhac;
import codegym.vn.entity.NhacForm;
import codegym.vn.service.NhacService;
import codegym.vn.service.NhacServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.transaction.Transactional;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
@PropertySource("classpath:upload_file.properties")
public class NhacController {
    @Value("${file-upload}")
    private String fileUpload;
    @Autowired
    private NhacService nhacService;


    @GetMapping(value = "/list")
    public String list(Model model) {
        List<Nhac> nhacList = nhacService.findAll();
        model.addAttribute("nhacList", nhacList);
        return "/list";
    }

    @GetMapping("/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("nhacForm", new NhacForm());
        return modelAndView;
    }

    @PostMapping("/save")
    public ModelAndView saveNhac(@ModelAttribute NhacForm nhacForm) {
        MultipartFile multipartFile = nhacForm.getFile();
        String fileName = multipartFile.getOriginalFilename();
        try {
            FileCopyUtils.copy(nhacForm.getFile().getBytes(), new File(fileUpload + fileName));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        Nhac nhac = new Nhac(nhacForm.getTen(), nhacForm.getNgheSi(), nhacForm.getTheLoai(), fileName);
        nhacService.create(nhac);
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("nhacForm", nhacForm);
        modelAndView.addObject("message", "Created new music successfully !");
        return modelAndView;
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable String ten, Model model) {
        model.addAttribute("nhac", nhacService.findByName(ten));
        return "/delete";
    }

    @PostMapping("/delete")
    public String delete(Nhac nhac, RedirectAttributes redirect) {
        nhacService.delete(nhac.getTen());
        redirect.addFlashAttribute("success", "Removed music successfully!");
        return "redirect:/nhac";
    }
    @GetMapping("/{ten}/update")
    public String edit(@PathVariable String ten, Model model) {
        model.addAttribute("product", nhacService.findByName(ten));
        return "/update";
    }

    public String update(Nhac nhac) {
        nhacService.update(nhac.getTen(), nhac);
        return "redirect:/nhac";
    }
}
