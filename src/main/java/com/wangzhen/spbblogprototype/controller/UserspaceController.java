package com.wangzhen.spbblogprototype.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName UserspaceController
 * @Description
 * @Author wangzhen
 * @Date 2018/11/14 下午7:38
 **/
@Controller
@RequestMapping("/u")
public class UserspaceController {

    @GetMapping("/{username}")
    public String userSpace(@PathVariable("username") String username) {
        System.out.println("username" + username);
        return "/userspace/u";
    }

    public String listBlogByOrder(@PathVariable("username") String username,
                                  @RequestParam(value = "order", required = false, defaultValue = "new") String order,
                                  @RequestParam(value = "category", required = false) Long category,
                                  @RequestParam(value = "keyword", required = false) String keyword) {
        if (category != null) {

            System.out.print("category:" + category);
            System.out.print("selflink:" + "redirect:/u/" + username + "/blogs?category=" + category);
            return "/userspace/u";

        } else if (keyword != null && keyword.isEmpty() == false) {

            System.out.print("keyword:" + keyword);
            System.out.print("selflink:" + "redirect:/u/" + username + "/blogs?keyword=" + keyword);
            return "/userspace/u";
        }

        System.out.print("order:" + order);
        System.out.print("selflink:" + "redirect:/u/" + username + "/blogs?order=" + order);
        return "/userspace/u";
    }

    @GetMapping("/{username}/blogs/{id}")
    public String listBlogsByOrder(@PathVariable("id") Long id) {

        System.out.print("blogId:" + id);
        return "/userspace/blog";
    }


    @GetMapping("/{username}/blogs/edit")
    public String editBlog() {

        return "/userspace/blogedit";
    }
}