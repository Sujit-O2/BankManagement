import java.sql.*;

public class sqll {
    Connection vv;
    String ss1,ss2;
    String sqlll(int a){
      try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        vv=DriverManager.getConnection("jdbc:mysql://localhost/bank","root","tAPASWINI");
        PreparedStatement pp=vv.prepareStatement("Select * from users where userid="+a);
        ResultSet ss=pp.executeQuery();
        while(ss.next()){
      ss2=ss.getString("pin");
      ss1=""+ss.getInt("accountno");
    }
      }
      catch(Exception e){
      }
      return null;
    }
     void signu(int a,String name,String fname,String dob,String email,String mob,String Status,String addres){
    try{
      Class.forName("com.mysql.cj.jdbc.Driver");
    vv = DriverManager.getConnection("jdbc:mysql://localhost/bank","root","tAPASWINI");
    PreparedStatement pp=vv.prepareStatement("insert into USERINFO values (?,?,?,?,?,?,?,?);");
    pp.setInt(1,a);
    pp.setString(2,name);
    pp.setString(3,fname);
    pp.setString(4,dob);
    pp.setString(5,email);
    pp.setString(6,mob);
    pp.setString(7,Status);
    pp.setString(8,addres);
System.out.println(pp.executeUpdate());
  }
    catch(Exception e)
    {
        System.out.println(e);
    }}
    void signup11(int a,String aad ,String pan ,String gen ,String feat){
      try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        vv=DriverManager.getConnection("jdbc:mysql://localhost/bank","root","tAPASWINI");
        PreparedStatement  pp= vv.prepareStatement("insert into USERDETAILS values(?,?,?,?,?);");
         pp.setInt(1,a);
        pp.setString(2,aad);
        pp.setString(3,pan);
        pp.setString(4,gen);
        pp.setString(5,feat);
       System.out.println(pp.executeUpdate());

      }
      catch(Exception e){
        System.out.println("12");
      }
    }
      void sqll1(int uid,String pin,int bid,int a,String amount){
          try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            vv=DriverManager.getConnection("jdbc:mysql://localhost/bank","root","tAPASWINI");
            PreparedStatement pp=vv.prepareStatement("INSERT INTO USERS VALUES(?,?,?,?,?)");
            pp.setInt(1,uid);
            pp.setString(2,pin);
            pp.setInt(3,bid);
            pp.setInt(4,a);
            pp.setString(5,amount);
            System.out.println(pp.executeUpdate());

          }
          catch(Exception e){
            e.printStackTrace();
            System.out.println();
          }
         
        }


        String name ,fname,status,gender,dob,email,mob,addrs,aadher,pan,features,balence;
        int userid;
        void details(int a) {
          try{Class.forName("com.mysql.cj.jdbc.Driver");
          Connection cc= DriverManager.getConnection("jdbc:mysql://localhost/bank","root","tAPASWINI");
           PreparedStatement p1 =cc.prepareStatement("Select * from users where accountno ="+a);
           PreparedStatement p2=cc.prepareStatement("Select * from userinfo where id ="+a);
           PreparedStatement p3=cc.prepareStatement("Select * from userdetails where user ="+a);
           ResultSet s1= p1.executeQuery();
           while(s1.next()){
           userid=s1.getInt("userid");
           balence=s1.getString("amount");
          }
           ResultSet s2= p2.executeQuery();
           while(s2.next()){
           name= s2.getString("name");
           fname= s2.getString("fname");
           dob=s2.getString("dob");
           email=s2.getString("email");
           mob=s2.getString("mob");
           status=s2.getString("status");
           addrs=s2.getString("address");
          }
           ResultSet s3=  p3.executeQuery();
           while(s3.next()){
           aadher=s3.getString("aadharno");
           pan=s3.getString("pan");
           gender=s3.getString("gender");
           features=s3.getString("features");
          }
        }
        catch(Exception e){

        }
               
               
        }
        public void dipwid(String a,int id){
          try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          vv=DriverManager.getConnection("jdbc:mysql://localhost/bank","root","tAPASWINI");
          PreparedStatement pp= vv.prepareStatement("update users set amount="+a+" where accountno="+id); 
          pp.executeUpdate();     
        
        }
          catch(Exception E){
            System.out.println("ddi");
          }
        }
  }
