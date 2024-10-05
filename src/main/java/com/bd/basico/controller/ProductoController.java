package com.bd.basico.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



import com.bd.basico.modelo.TblProducto;
import com.bd.basico.servicio.IProductoServicio;

@Controller
@RequestMapping("/Vistas")
public class ProductoController {

    @Autowired
    private IProductoServicio iproductoservicio;

    @GetMapping("/ListadoProducto")
    public String ListadoProducto(Model modelo) {
        List<TblProducto> listado = iproductoservicio.ListadoProductos();
        modelo.addAttribute("listado", listado);
        return "/Vistas/ListadoProducto";
    }

    @GetMapping("/RegistrarProducto")
    public String RegistrarProducto(Model modelo) {
        TblProducto producto = new TblProducto();
        modelo.addAttribute("regproducto", producto);
        return "/Vistas/FrmCrearProducto";
    }

    @PostMapping("/GuardarProducto")
    public String GuardarProducto(@ModelAttribute TblProducto producto, Model modelo) {
        iproductoservicio.RegistrarProducto(producto);
        return "redirect:/Vistas/ListadoProducto";
    }

    @GetMapping("/editar/{id}")
    public String Editar(@PathVariable("id") Integer idProducto, Model modelo) {
        TblProducto producto = iproductoservicio.BuscarporId(idProducto);
        modelo.addAttribute("regproducto", producto);
        return "/Vistas/FrmCrearProducto";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Integer idProducto, Model modelo) {
        iproductoservicio.Eliminar(idProducto);
        List<TblProducto> listado = iproductoservicio.ListadoProductos();
        modelo.addAttribute("listado", listado);
        return "redirect:/Vistas/ListadoProducto";
    }
}
