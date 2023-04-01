class Marks{
   private  String name;
   private int Marks; 

   public void setMarks(int a)
   {
      Marks= a;
   }
   public int getMarks()
   {
     return Marks;
   }
   public void setName(String b)
   {
      name =b;

   }
    public String getName()
    {
        return name;
    }
}
    public class Encapsulation{
        public static void main(String[] args) {
            Marks obj = new Marks();
            obj.setMarks(25);
            obj.setName("Mahesh");
            System.out.println(obj.getName() +"  :  " + obj.getMarks());
    
        }
       }   





       