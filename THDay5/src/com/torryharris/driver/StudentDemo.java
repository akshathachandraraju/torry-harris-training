package com.torryharris.driver;
import com.torryharris.model.Branch;
import com.torryharris.model.College;
import com.torryharris.model.Students;

public class StudentDemo {
    public static void main(String[] args) {
        College VTU=new College(01,"VTU","Bangalore");
        Branch cs=new Branch("ComputerScience",11,VTU);
        Students s1=new Students(1210,"Sita",VTU,cs);
        s1.displayStudent();


    }
}
