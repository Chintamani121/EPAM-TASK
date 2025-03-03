package jml1.Task2;

class PartTimeEmployee extends Employee {
    int experience;
    int getExperience() {return experience;}
    void setExperience(int experience) {
        if(experience<0 || experience>=100){
            throw new IllegalArgumentException("write valid experience");
        }
        else this.experience=experience;
    }

    PartTimeEmployee(int employeeId, String name, String department, int workHours, double salary, int experience) {
        super(employeeId, name, department, workHours, salary);
        if(experience<0 || experience>100){
            throw new IllegalArgumentException("write valid experience");
        }
        else this.experience=experience;
    }


    @Override
    public String toString(){
        return super.toString()+" work hours is : "+ getWorkHours()+" type is : Part Time"+" Experience is : "+getExperience();
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }

}

