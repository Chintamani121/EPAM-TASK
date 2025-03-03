    package jml1.Task0;

    import java.util.HashSet;

    class Employee implements Comparable<Employee> {
        private int employeeId;
        private String name;
        private String department;
        private int workHours;
        private double baseSalary;
        private static final HashSet<Integer> set=new HashSet<>() ;
        void getDetails() {}

        //CompareTo method for natural ordering
        @Override
        public int compareTo(Employee other){
            return Integer.compare(this.getEmployeeId(),other.getEmployeeId());
        }

        //Constructor
        Employee(int employeeId, String name, String department, int workHours, double salary){
            if(employeeId<=0){
                throw new IllegalArgumentException("write valid employee id");
            }
            else if(set.contains(employeeId)){
                throw new IllegalArgumentException("write unique employee id");
            }
            else{
                this.employeeId=employeeId;
                set.add(employeeId);
            }
            if(name==null){
                throw new IllegalArgumentException("name can not be null");
            }
            else if(name.isBlank()){
                throw new IllegalArgumentException("write valid name");
            }
            else this.name=name;

            if(department==null){
                throw new IllegalArgumentException("department can not be null");
            }
            else if(department.isBlank()){
                throw new IllegalArgumentException("write valid department");
            }
            else this.department=department;

            if(workHours<0 || workHours>24){
                throw new IllegalArgumentException("write valid work hours");
            }
            else this.workHours=workHours;

            if(salary<0){
                throw new IllegalArgumentException("write valid salary");
            }
            else this.baseSalary=salary;
        }
        //Setter
        void setEmployeeId(int employeeId) {
            if(employeeId<0){
                throw new IllegalArgumentException("write valid employee id");
            }
            else if(set.contains(employeeId)){
                throw new IllegalArgumentException("write unique employee id");
            }
            else{
                this.employeeId=employeeId;
                set.add(employeeId);
            }
        }
        void setName(String name) {
            if(name==null) throw new IllegalArgumentException("name can not be null");
            else if(name.isBlank()) throw new IllegalArgumentException("write valid name");
            else this.name = name;
        }
        void setDepartment(String department) {
            if(department==null) throw new IllegalArgumentException("department can not be null");
            else if(department.isBlank()) throw new IllegalArgumentException("write valid department");
            else this.department = department;
        }

        void setWorkHours(int workHours) {
            if(workHours<0 || workHours>24){
                throw new IllegalArgumentException("write valid work hours");
            }
            else this.workHours=workHours;
        }

        void setSalary(double salary) {
            if(salary<0){
                throw new IllegalArgumentException("write valid salary");
            }
            else this.baseSalary = salary;
        }

        //Getter
        int getEmployeeId(){ return this.employeeId;}
        String getName(){return this.name;}
        String getDepartment(){return this.department;}
        public double getSalary(){
            return baseSalary;
        }

        //for getting employee info
        @Override
        public String toString(){
            return " Employee id : "+this.employeeId+" Employee name : "+this.name +" Employee department : "+this.department;
        }


        int getWorkHours() {
            return workHours;
        }
    }
