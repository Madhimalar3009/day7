class std{
private String name;
private int rollno;
public void setname(String name){
this.name=name;
}
public void setrollno(int rollno){
this.rollno=rollno;}
public int getrollno(){
return rollno;
}

public String getname(){
return name;}

public static void main(String[] args){
std s=new std();
s.setname("madhi");
System.out.println(s.getname());
s.setrollno(231344);
System.out.println(s.getrollno());

}

}
