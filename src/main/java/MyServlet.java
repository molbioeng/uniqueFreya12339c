import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/pats"}, loadOnStartup = 1)
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException{
                resp.setContentType("text/html");
                resp.getWriter().write("<ul class=\"level-one\">\n" +
                        "<li>\n" +
                        "<p class=\"first-para\"><b>Headings:</b> </p>\n" +
                        "<h1>Top heading</h1>\n" +
                        "<p>, </p>\n" +
                        "<h2 id=\"tab5\">Next-level heading</h2>\n" +
                        "<p>, … </p>\n" +
                        "<h6>Lowest heading</h6>\n" +
                        "\n" +
                        "</li>\n" +
                        "<li>\n" +
                        "<p class=\"first-para\"><b>Bold:</b> <b>text</b></p>\n" +
                        "</li>\n" +
                        "<li>\n" +
                        "<p class=\"first-para\"><b>Italic:</b> <i>text</i></p>\n" +
                        "</li>\n" +
                        "<li>\n" +
                        "<p class=\"first-para\"><b>Paragraph:</b> </p>\n" +
                        "<p>A paragraph of text</p>\n" +
                        "\n" +
                        "</li>\n" +
                        "<li>\n" +
                        "<p class=\"first-para\"><b>Bulleted list:</b> </p>\n" +
                        "<ul>\n" +
                        "<li>First list item</li>\n" +
                        "<li>Second list item</li>\n" +
                        "</ul>\n" +
                        "</li>\n" +
                        "<li>\n" +
                        "<p class=\"first-para\"><b>Numbered list:</b> </p>\n" +
                        "<ol>\n" +
                        "<li>Item #1</li>\n" +
                        "<li>Item #2</li>\n" +
                        "</ol>\n" +
                        "</li>\n" +
                        "<li>\n" +
                        "<p class=\"first-para\"><b>Bulleted list:</b> </p>\n" +
                        "<ul>\n" +
                        "<li>First list item</li>\n" +
                        "<li>Second list item</li>\n" +
                        "</ul>\n" +
                        "</li></ul>");
                resp.getWriter().write("\n ServletPath of the URL: " + req.getServletPath());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException{

    }
}


