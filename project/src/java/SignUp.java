import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

/**
 *
 * @author prabhjeet kaur
 */
public class SignUp extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        response.setContentType("text/html");
        
        PrintWriter out = response.getWriter();
	
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        try{
     
        Class.forName("com.mysql.jdbc.Driver");

          Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","1234");

        PreparedStatement st=con.prepareStatement("insert into user values(?,?,?)");

        st.setString(1, name);
        st.setString(2, email);
        st.setString(3, password);
        int i=st.executeUpdate();
        
          if(i>0)
          {
            out.println(" <h1 align=\"center\">History </h1>Entrance to The Golden Temple in 1947\n" +
"The Harmandir Sahib literally means the Temple of God. Guru Amar Das had ordered Guru Ram Das to"
                    + " create a nectarous tank as a place for worship for the Sikh religion."
                    + " Guru Ram Das instructed all his Sikhs to join in the work, under Bhai Budha's "
                    + "superintendence, and engaged laborers’ to assist them. He said that the tank of "
                    + "nectar should be God's home, and whoever bathed in it shall obtain all spiritual and "
                    + "temporal advantages. During the progress of the work, the hut in which the Guru first"
                    + " sheltered himself was expanded for his residence; it is now known as the Guru's Mahal, or palace.[In 1578 CE Guru Ram Das excavated a tank, which subsequently became known as Amritsar (Pool of the Nectar of Immortality),[12] giving its name to the city that grew around it. In due course, the Harmandir Sahib, was built in the middle of this tank and became the supreme centre of Sikhism. Its sanctum came to house the Adi Granth comprising compositions of Sikh Gurus and other saints considered to have Sikh values and philosophies, e.g., Baba Farid, and Kabir. The compilation of the Adi Granth was started by the fifth guru of Sikhism, Guru Arjan.\n" +
"Maharaja Ranjit Singh listening to Guru Granth Sahib near Harmindir Sahib"
                    + "<h1 align=\"center\">Operation Blue Star\n</h1>" +
"Blue Star was a military operation undertaken between 3 and 6 June 1984. The Indian prime minister Indira Gandhi ordered the Indian Army to launch the operation. The army, led by General Kuldip Singh Brar, brought infantry, artillery and tanks into the Harmandir Sahib to put a stop to the Dharam Yudh Morcha led by Jarnail Singh Bhindranwale. During the Dharam Yudh Morcha thousands of Sikhs courted arrest.[citation needed] Fierce fighting ensued between Sikhs and the army, with heavy casualties on both sides. The Harmandir Sahib complex also suffered much damage during the attack, especially the holy Akal Takht. Within six months, on 31 October 1984, Indira Gandhi's Sikh bodyguards killed her as revenge for the operation.\n" +
"This attack is regarded by Sikhs, and the international human rights community[citation needed], as a desecration of Sikhism's holiest shrine and discrimination against a minority in India. In 1986, the repairs performed on the Akal Takht Sahib after the attack, which the Rajiv Gandhi government had undertaken without consultation,[20] were removed. A new Akal Takht Sahib was completed in 1999 by Kar Sevaks (volunteers)."
                    + "<h1 align=\"center\">World's largest free kitchen (Langar)</h1>\n" +
"Harmandir Sahib is home to the world's largest free kitchen. According to the Croatian Times, it can serve free food for up to 100,000 - 300,000 people every day.[22] At the Langar (Kitchen), food is served to all visitors regardless of faith, religion, or background. Vegetarian food is served to ensure that all people, even those with dietary restrictions, can eat together as equals. The institution of the Sikh langar, or free kitchen, was started by the first Sikh Guru (Prophet), Guru Nanak. It was designed to uphold the principle of equality between all people regardless of religion, caste, colour, creed, age, gender, or social status, a revolutionary concept in the caste-ordered society of 16th century India where Sikhism began. In addition to the ideals of equality, the tradition of langar expresses the ethics of sharing, community, inclusiveness, and oneness of all humankind. Every Sikh Gurdwara (place of worship) "
                    + "has a langar, providing free vegetarian food for all comers");
           
           
        }
        
            
        }
        catch(ClassNotFoundException | SQLException se)
        {
        }
	
      }
  }