import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class employeefile {
    int id;
    String fname;
    int salary;
    public  employeefile(int id,String fname,int salary){
        this.id=id;
        this.fname=fname;
        this.salary=salary;
    }
     //getter
     public int getid(){
        return id;
    }
    //setter
    public int setid(int id){
        return id;
    }
     //getter
     public String getfname(){
        return fname;
    }
    //setter
    public String setfname(String fname){
        return fname;
    }
     //getter
     public int getsalary(){
        return salary;
    }
    //setter
    public int setsalary(int salary){
        return salary;
    }
    @Override
    public String toString(){
        return "employee [id=" +id+ ",fname=" +fname+ ", salary=" +salary+ "] ";
    }
    static employeefile b1= new employeefile(180,"naresh",1200000);
    static employeefile b2=new employeefile(50,"red",1500000);
    public static void main(String[] args){
       
        try{
            File file=new File("emp.txt");
            FileReader reader =new FileReader(file);
            String data = "";
            System.out.print("Previous data : ");
          
            while(true){
                int value =reader.read();
                if(value==-1){
                    break;
                }
                data += ((char) value);
                System.out.print((char) value);
            }
            reader.close();
         
        
          FileWriter writer =new FileWriter(file);
            writer.append(data+b1+b2);//adding data to emp.txt file
            
            writer.close();
          
          
        }catch(IOException f){
       System.out.println("file not found");
      }
       
    }
}
