/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import dao.GeneroDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Genero;

/**
 *
 * @author Gabriel Medeiros
 */
@WebServlet(name = "GeneroWS", urlPatterns = {"/admin/genero/GeneroWS"})
public class GeneroWS extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acao = request.getParameter("txtAcao");
        RequestDispatcher destino;
        String pagina;
        switch(String.valueOf(acao)){
            case "add":
                pagina = "add.jsp";
                break;
            case "edit":
                pagina = "edit.jsp";
                break;
            case "del":
                pagina = "list.jsp";
                break;
            default:
                String filtro = request.getParameter("filtro");
                if(filtro==null){
                    
                }
                else{
                    
                }
                pagina = "list.jsp";
                break;
        }
        destino = request.getRequestDispatcher(pagina);
        destino.forward(request, response);
    
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
    Genero obj;
    GeneroDAO dao = new GeneroDAO();
    
    String id = request.getParameter("txtId");
    
    if(id!=null){
        obj = dao.buscarPorChavePrimaria(Long.parseLong(id));
    }
    else{
        obj = new Genero();
    }
    }
    

}
