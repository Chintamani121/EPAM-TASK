package jml1.Task0;

class FullTimeEmployee extends Employee {
    int providentFund;

    FullTimeEmployee(int employeeId, String name, String department, int workHours, double salary, int providentFund) {
        super(employeeId, name, department, workHours, salary);
        if (providentFund < 0) {
            throw new IllegalArgumentException("write valid provident fund amount");
        } else this.providentFund = providentFund;

    }

    int getProvidentFund() {
        return providentFund;
    }

    void setProvidentFund(int providentFund) {
        if (providentFund < 0) {
            throw new IllegalArgumentException("write valid provident fund amount");
        } else this.providentFund = providentFund;
    }



    @Override
    public String toString() {
        return super.toString() + " work hours is : " + getWorkHours() + "type is : Full Time" + "Provident fund is : " + getProvidentFund();
    }

    @Override
    public double getSalary()  {
        return super.getSalary();
    }
}
