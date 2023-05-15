package prod;

import prod.domain.StudentOrder;


public class SaveStudentOrder {
    public static void main(String[] args) {
//        buildStudentOrder();
        saveStudentOrder();
    }
    static void saveStudentOrder(){
        StudentOrder so = new StudentOrder();

    }
    public static StudentOrder buildStudentOrder(long id){
        StudentOrder so = new StudentOrder();
        so.setStudentOrderId(id);

        printStudentOrder(so);
        return so;
    }
    static void printStudentOrder(StudentOrder studentOrder){
        System.out.println(studentOrder.getStudentOrderId());
    }



}

