package com.example.course.controllers;

import com.example.course.models.Usuario;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/app") // "http://localhost:8080/app"
public class IndexController {

    @Value("${texto.IndexController}")
    private String textoTitulo;

    @GetMapping({"/index", "/", "/home"})
    public String index(Model model) {
        model.addAttribute("titulo", textoTitulo);
        model.addAttribute("h1", "Hola Model");
        return "index";
    }

    @GetMapping("/perfil")
    public String perfil(Model model) {
        Usuario usuario = new Usuario("pepe", "grillo", "pepe@gmail.com");
        model.addAttribute("h1", "Perfil Usuario : ".concat(usuario.getNombre()));
        model.addAttribute("titulo", "Perfil Usuario");
        model.addAttribute("usuario",usuario);
        return "perfil";
    }

    @GetMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("titulo", "Lista de usuarios");
        return "listar";
    }

    @ModelAttribute("usuarios")
    public List<Usuario> poblarUsuarios(){
        List<Usuario> usuarios =Arrays.asList(new Usuario("j","k","l"),
                new Usuario("m","n","o"));
        return usuarios;
    }
}
