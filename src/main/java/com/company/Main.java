package com.company;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sun.rmi.runtime.Log;

import javax.annotation.PostConstruct;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

@WebServlet("/")
public class Main extends HttpServlet {

    private final static Logger LOGGER = LogManager.getLogger (Main.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LOGGER.info ("Start Metod");
        Writer writer = resp.getWriter ();
        writer.write ("test");
        writer.flush ();
        LOGGER.info ("End ");
    }

}


