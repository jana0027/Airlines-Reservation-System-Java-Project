import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class pick extends HttpServlet
{
	 public void doGet(HttpServletRequest re,HttpServletResponse rs)
			 throws ServletException,IOException
	 {
	 	rs.setContentType("text/html");
		PrintWriter out=rs.getWriter();
		out.println("<html>");
		out.println("<head><title>cyber credit card system</title>");
		out.println("</head>");
		out.println("<body alink=navy vlink=#990000 bgcolor=#efefe9>");
		out.println("<MARQUEE behavior=slide align=center bgcolor=navy><font color=#fbfbf1 size=5 face=Times new roman><b>CYBER CREDIT CARD SYSTEM</font></marquee><br>");
		out.println("<MARQUEE behavior=slide align=center bgcolor=#eb922c><font color=#fbfbf1 size=5 face=Times new roman>");
		out.println("<b>Select A Credit Card Of Your Own Choice</font></MARQUEE>");
		out.println("<br><br><a name='#top'>");
		out.println("<table align=center cellspacing=25 width=85%>");
		out.println("<tr><td><a href='#solid'><b>ICICI Bank Solid Gold Credit Cards</a></td>");
		out.println("<td><a href='#HPCL_gold'><b>ICICI HPCL Gold Credit Cards</a></td>");
		out.println("<td><a href='#silver'><b>ICICI Bank Sterling Silver Credit Cards</a></td></tr>");
		out.println("<tr><td><img src='d:/student/madhav/project/goldcards.gif' alt='Internet world'></td>");
		out.println("<td><img src='d:/student/madhav/project/cards_hpcl_goldvisa.jpg' alt='Internet world'></td>");
		out.println("<td><img src='d:/student/madhav/project/silvercards.gif' alt='Internet world'></td></tr>");
		out.println("<tr><td><a href='#HPCL_silver'><b>ICICI HPCL Silver Credit Cards</a></td>");
		out.println("<td><a href='#Blue'><b>ICICI Bank True Blue Credit Cards</a></td>");
		//out.println("<td><a href='http://localhost:8080/servlet/credit'><img src='d:/student/madhav/project/appl.gif'></a></td></tr>");
		out.println("<tr><td><img src='d:/student/madhav/project/cards_hpcl_silvervisa.jpg' alt='Internet world'></td>");
		out.println("<td><img src='d:/student/madhav/project/bluecards.gif' alt='Internet world'></td></tr>");
		out.println("</table></a>");
		out.println("<font color=#336699 size=3 face=Times new roman><b>");
		out.println("<a name='#solid'>ICICI Bank Solid Gold Credit Cards</font>");
		out.println("<BR>");
		out.println("<font color=#990000 size=3 face=Times new roman>");
		out.println("<b>Benefits of Solid Gold Card </font>");
		out.println("<UL>");
		out.println("<LI>High credit and cash limits. ");
		out.println("<LI>Balance transfer at 1.5%. ");
		out.println("<LI>Zero lost card liability. ");
		out.println("<LI>Purchase protection - Rs.40,000. ");
		out.println("<LI>Credit Shield of Rs.50,000. ");
		out.println("<LI>Travel Benefits. ");
		out.println("<LI> Insurance for both primary and add-on cards upto Rs. 20 lakhs. ");
		out.println("<LI>Household insurance upto Rs.75,000. ");
		out.println("<LI>Baggage insurance and Hospitalisation Benefitupto");
		out.println("<LI>E-mail- Mobile Alerts and Statement");
		out.println("</UL></a>");
		out.println("<a href='#top'>Top</a><br><br>");
		out.println("<font color=#336699 size=3 face=Times new roman>");
		out.println("<a name='#HPCL_gold'>");
		out.println("<b>ICICI Bank HPCL Solid Gold Credit Cards</font><BR>");
		out.println("<font color=#990000 size=3 face=Times new roman>");
		out.println("<b>Benefits Of HPCL Solid Gold Card. </font>");
		out.println("<UL>");
		out.println("<LI>Earn and Redeem rewards points- select HPCL Petrol Pumps- free fuel. ");
		out.println("<LI> redeem rewards in bookshops, jewellery, stores ");
		out.println("<LI>Earn 15 reward points for every Rs.100/- spent at partner outlets. ");
		out.println("<LI>Refund of Surcharges (2.5%) on Fuel Purchases. ");
		out.println("<LI>Discount on tyres, batteries and auto accessories sold at select HPCL Petrol Pumps. ");
		out.println("<LI>High credit and cash limits. ");
		out.println("<LI>Balance transfer at 1.5%. ");
		out.println("<LI>Lost card liability-zero and purchase protection - Rs.40,000. ");
		out.println("<LI>Credit Shield of Rs.50,000 and comprehensive Travel Benefits. ");
		out.println("<LI>Comprehensive Insurance for both primary and add-on cards upto Rs. 20 lakhs. ");
		out.println("<LI>Household insurance upto Rs.75,000.Baggage insurance upto Rs. 25,000. ");
		out.println("<LI>Hospitalisation Benefit policy upto Rs.50,000. ");
		out.println("<LI>Mobile Alerts and Statement by E-mail ");
		out.println("</UL>");
		out.println("<font color=#990000 size=3 face=Times new roman>");
		out.println("<b>Eligibility For Solid Gold Card. </font>");
		out.println("<UL>");
		out.println("<LI>Validity : International");
		out.println("<LI>Fees");
		out.println("<font color=navy size=3 face=Times new roman>");
		out.println("<OL>");
		out.println("<LI>Joining Fees: Rs. 300/- ;");
		out.println("<LI>Annual Fees : Rs. 1,200/- ;Add on : Rs. 600/-");
		out.println("</OL>");
		out.println("</FONT>");
		out.println("<LI>Income Eligibility :");
		out.println("<font color=navy size=3 face=Times new roman>");
		out.println("<OL>");
		out.println("<LI> Salaried  Rs. 1,20,000/-");
		out.println("<LI> Self Employed Rs. 1,00,000/- </font>");
		out.println("</OL>");
		out.println("<LI>Credit Details:");
		out.println("<font color=navy size=3 face=Times new roman>");
		out.println("<OL>");
		out.println("<LI> Credit Period 20 to 50 days ");
		out.println("<LI>Minimum payment required 5% of the bill amount");
		out.println("<LI> Minimum of Rs. 75/- and maximum of Rs.500/-");
		out.println("<LI>Interest Charge 2.50 %</FONT>");
		out.println("</OL>");
		out.println("<LI>Cash Withdrawals ");
		out.println("<font color=navy size=3 face=Times new roman> ");
		out.println("<OL>");
		out.println("<LI>Cash advance charges 2.95% on cash  ");
		out.println("<LI>Cash advance  limit Maximum withdrawal to Rs.15,000 in a single day");
		out.println("</font></OL>");
		out.println("<LI>Insurance :    ");
		out.println("<font color=navy size=3 face=Times new roman> ");
		out.println("<OL>");
		out.println("<LI>Personal Accident Upto Rs. 15 Lacs ");
		out.println("<LI>Air Accident Rs. 5,00,000/- Purchase Protection Rs. 40, 000/- ");
		out.println("<LI>Baggage Rs. 25, 000/-Household Insurance Rs. 1,00, 000/- ");
		out.println("</OL>");
		out.println("</font> ");
		out.println("<LI>Benefits:      ");
		out.println("<font color=navy size=3 face=Times new roman> ");
		out.println("<OL>");
		out.println("<LI>Dial-A-Draft  Free ;Auto Debit (for Minimum Amount Due) Yes ");
		out.println("<LI>Balance transfer facility 1.5% ;Temporary Credit Limit Enhancement Yes ");
		out.println("<LI>Credit Shield  Rs. 50,000/- Airline Tele-Ticketing   Yes ");
		out.println("<LI>Out of Town Cheque Processing Yes </FONT>");
		out.println("</OL>");
		out.println("</UL></a><a href='#top'>Top</a><br><br>");
		out.println(" <font color=#336699 size=3 face=Times new roman>");
		out.println("<a name='#silver'>");
		out.println("<b>ICICI Bank Sterling Silver Credit Cards</font><BR>");
		out.println("<font color=#990000 size=3 face=Times new roman>");
		out.println("<b>Benefits Of Sterling Silver Card. </font>");
		out.println("<UL>");
		out.println("<LI>A Card offers special benefits to your family with a Free 'Bandhan' add-on card. ");
		out.println("<LI>Comprehensive Insurance for both primary and add-on cards upto Rs. 10 lakhs. ");
		out.println("<LI>Household insurance upto Rs.20,000 and Baggage insurance upto Rs. 10000. ");
		out.println("<LI>Hospitalisation Benefit policy upto Rs.25,000. ");
		out.println("<LI>Purchase protection of Rs.20,000. Credit Shield of Rs.25,000. ");
		out.println("<LI>Comprehensive travel related insurance and Travel Benefits");
		out.println("<LI>Zero Lost card liability. ");
		out.println("<LI>Dial a draft at 1%.Balance transfer at 1.75%. ");
		out.println("<LI>Mobile Alerts and Statement by E-mail ");
		out.println("</UL></a><a href='#top'>Top</a><br><br>");
		out.println("<font color=#336699 size=3 face=Times new roman>");
		out.println("<a name='#HPCL_silver'>");
		out.println("<b>ICICI Bank HPCL Sterling Silver Credit Cards</font><BR>");
		out.println("<font color=#990000 size=3 face=Times new roman>");
		out.println("<b>Benefits Of HPCL Sterling Silver Card. </font>");
		out.println("<UL>");
		out.println("<LI>Refund of Surcharges (2.5%) on Fuel Purchases. ");
		out.println("<LI>Exciting rewards - 2 points for every Rs.125/- spent at HP Petrol Pumps. ");
		out.println("<LI>15% discount on at select HPCL Petrol Pumps. ");
		out.println("<LI>Discount on tyres, batteries and auto accessories sold at select HPCL Petrol Pumps. ");
		out.println("<LI>Comprehensive Insurance for both primary and add-on cards upto Rs. 10 lakhs. ");
		out.println("<LI>Household insurance upto Rs.20,000. Baggage insurance upto Rs. 10000. ");
		out.println("<LI>Hospitalisation Benefit policy upto Rs.25,000. ");
		out.println("<LI>Purchase protection of Rs.20,000. ");
		out.println("<LI>Credit Shield of Rs.25,000. ");
		out.println("<LI>Comprehensive travel related insurance. ");
		out.println("<LI>Zero Lost card liability. ");
		out.println("<LI>Dial a draft at 1% fee.Balance transfer at 1.75%. ");
		out.println("<LI>Most powerful catalogue based rewards Program. ");
		out.println("<LI>Mobile Alerts and Statement by E-mail");
		out.println("</UL></a><a href='#top'>Top</a><br><br>");
		out.println("<font color=#336699 size=3 face=Times new roman>");
		out.println("<a name='#blue'>");
		out.println("<b>ICICI Bank True Blue Credit Cards</font><BR>");
		out.println("<font color=#990000 size=3 face=Times new roman>");
		out.println("<b>Benefits Of True Blue Card. </font>");
		out.println("<UL>");
		out.println("<LI>Visa and MasterCard acceptability across 1,10,000 merchant establishments in India. ");
		out.println("<LI>Dial a draft at 1%. ");
		out.println("<LI>Balance transfer at 1.75% ");
		out.println("<LI>Purchase protection of Rs.10,000. ");
		out.println("<LI>Credit shield of Rs.10,000. ");
		out.println("<LI>Most powerful catalogue based rewards Program. ");
		out.println("<LI>Comprehensive Travel Benefits. ");
		out.println("<LI>Personal Accident Insurance of Rs.3 lakhs (air) and Rs. 1 lakh (any other accident). ");
		out.println("<LI>Access to 24-hour Customer Care Centre and all VISA and MasterCard approved ATMS ");
		out.println("<LI>Mobile Alerts and Statement by E-mail ");
		out.println("</UL></a><a href='#top'>Top</a>");
		out.println("<a href='http://localhost:8080/servlet/homepage'><img align=right src='d:/student/madhav/project/home3.gif'></a>");
		out.println("</body>");
		out.println("</html>");
		out.close();
  	 }
}