package com.xyly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by daichao on 2018/1/17.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("menu","menu");
        return "index";
    }
    @RequestMapping("/main")
    public String xyly(Model model) {
        model.addAttribute("menu","menu");
        return "main/index";
    }
    @RequestMapping("/SympleAndDynamic")
    public String getTable(Model model) {
        model.addAttribute("menu","menu");
        return "main/tables";
    }
    @RequestMapping("/forms")
    public String getForm(Model model) {
        model.addAttribute("menu","menu");
        return "main/form-elements";
    }
    @RequestMapping("/forms2")
    public String getForm2(Model model) {
        model.addAttribute("menu","menu");
        return "main/form-elements-2";
    }
    @RequestMapping("/forms-wizard")
    public String getFormWizard(Model model) {
        model.addAttribute("menu","menu");
        return "main/form-wizard";
    }
    @RequestMapping("/wysiwyg")
    public String getWysiwyg(Model model) {
        model.addAttribute("menu","menu");
        return "main/wysiwyg";
    }
    @RequestMapping("/dropzone")
    public String getDropzone(Model model) {
        model.addAttribute("menu","menu");
        return "main/dropzone";
    }
    @RequestMapping("/typography")
    public String getTypography(Model model) {
        model.addAttribute("menu","menu");
        return "main/typography";
    }
    @RequestMapping("/elements")
    public String getElements(Model model) {
        model.addAttribute("menu","menu");
        return "main/elements";
    }
    @RequestMapping("/buttons")
    public String getButtons(Model model) {
        model.addAttribute("menu","menu");
        return "main/buttons";
    }
    @RequestMapping("/content-slider")
    public String getContentSlider(Model model) {
        model.addAttribute("menu","menu");
        return "main/content-slider";
    }
    @RequestMapping("/treeview")
    public String getTreeview(Model model) {
        model.addAttribute("menu","menu");
        return "main/treeview";
    }
    @RequestMapping("/jquery-ui")
    public String getJqueryUI(Model model) {
        model.addAttribute("menu","menu");
        return "main/jquery-ui";
    }
    @RequestMapping("/top-menu")
    public String getTopMenu(Model model) {
        model.addAttribute("menu","menu");
        return "main/top-menu";
    }
    @RequestMapping("/two-menu-1")
    public String getTwoMenu1(Model model) {
        model.addAttribute("menu","menu");
        return "main/two-menu-1";
    }
    @RequestMapping("/two-menu-2")
    public String getTwoMenu2(Model model) {
        model.addAttribute("menu","menu");
        return "main/two-menu-2";
    }

    @RequestMapping("/mobile-menu-1")
    public String getMobileMenu1(Model model) {
        model.addAttribute("menu","menu");
        return "main/mobile-menu-1";
    }
    @RequestMapping("/mobile-menu-2")
    public String getMobileMenu2(Model model) {
        model.addAttribute("menu","menu");
        return "main/mobile-menu-2";
    }
    @RequestMapping("/mobile-menu-3")
    public String getMobileMenu3(Model model) {
        model.addAttribute("menu","menu");
        return "main/mobile-menu-3";
    }
    @RequestMapping("/widgets")
    public String getWidgets(Model model) {
        model.addAttribute("menu","menu");
        return "main/widgets";
    }
    @RequestMapping("/calendar")
    public String getCalendar(Model model) {
        model.addAttribute("menu","menu");
        return "main/calendar";
    }
    @RequestMapping("/gallery")
    public String getGallery(Model model) {
        model.addAttribute("menu","menu");
        return "main/gallery";
    }
    @RequestMapping("/profile")
    public String getProfile(Model model) {
        model.addAttribute("menu","menu");
        return "main/profile";
    }
    @RequestMapping("/inbox")
    public String getInbox(Model model) {
        model.addAttribute("menu","menu");
        return "main/inbox";
    }
    @RequestMapping("/pricing")
    public String getPricing(Model model) {
        model.addAttribute("menu","menu");
        return "main/pricing";
    }
    @RequestMapping("/invoice")
    public String getInvoice(Model model) {
        model.addAttribute("menu","menu");
        return "main/invoice";
    }
    @RequestMapping("/timeline")
    public String getTimeline(Model model) {
        model.addAttribute("menu","menu");
        return "main/timeline";
    }
    @RequestMapping("/search")
    public String getSearch(Model model) {
        model.addAttribute("menu","menu");
        return "main/search";
    }
    @RequestMapping("/email")
    public String getEmail(Model model) {
        model.addAttribute("menu","menu");
        return "main/email";
    }
    @RequestMapping("/login")
    public String getLogin(Model model) {
        model.addAttribute("menu","menu");
        return "main/login";
    }
    @RequestMapping("/faq")
    public String getFaq(Model model) {
        model.addAttribute("menu","menu");
        return "main/faq";
    }
    @RequestMapping("/error-500")
    public String getError500(Model model) {
        model.addAttribute("menu","menu");
        return "main/error-500";
    }
    @RequestMapping("/error-404")
    public String getError404(Model model) {
        model.addAttribute("menu","menu");
        return "main/error-404";
    }
    @RequestMapping("/grid")
    public String getGrid(Model model) {
        model.addAttribute("menu","menu");
        return "main/grid";
    }
    @RequestMapping("/blank")
    public String getBlank(Model model) {
        model.addAttribute("menu","menu");
        return "main/blank";
    }
    @RequestMapping("/jqgrid")
    public String getJqgrid(Model model) {
        model.addAttribute("menu","menu");
        return "main/jqgrid";
    }
    @RequestMapping("/dashboard")
    public String getDashboard(Model model) {
        model.addAttribute("menu","menu");
        return "main/dashboard";
    }

}
