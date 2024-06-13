package oop.QuanLySinhVien;

public class QuanLySV {

      protected Student[] listStudent;
      protected int limit;
      protected int size;
      public QuanLySV(int limit) {
          this.listStudent = new Student[limit];
          this.limit=limit;
          this.size=0;
      }
      public void addStudent(Student student){
          if(this.size == this.limit){
              System.out.println("Student full");
          }
          else {
              listStudent[size] = student;
              this.size++;
          }
      }

      public void DeleteStudent(Student student){
          Student[] newList=new Student[this.limit-1];
          for(int i=0,j=0; i<this.size; i++){
              if(listStudent[i].getId()== student.getId()){
                  continue;
              }
              newList[j]=listStudent[i];
              j++;

          }
          System.arraycopy(newList,0,listStudent,0,this.size);
      }
      public Student EditStudent(int id){
          for (int i = 0; i < this.size; i++) {
              if (this.listStudent[i].getId() == id) {
                  return listStudent[i];
              }
          }
          return null ;
      }
    public void ShowStudent(){
          if(this.size==0){
              System.out.println("Student empty");
          }
        for(int i=0; i<this.size; i++){
            System.out.println(listStudent[i]);
        }
    }


}
