package jml2.Task1.EmployeeType;
import jml2.Task1.Annotations.AlwaysPositive;
import jml2.Task1.Annotations.NotNull;
import jml2.Task1.Validators.Validate;

public class ContractorEmployee extends Employee {
    @NotNull
    @AlwaysPositive
    private Integer hoursWorked;
    @NotNull
    @AlwaysPositive
    private Double hourlyRate;

    private ContractorEmployee(ContractorEmployeeBuilder builder) {
        super(builder);
        this.hoursWorked = builder.hoursWorked;
        this.hourlyRate = builder.hourlyRate;
        Validate.validate(this);
    }

    public static class ContractorEmployeeBuilder extends EmployeeBuilder<ContractorEmployeeBuilder> {
        private Integer hoursWorked;
        private Double hourlyRate;

        public ContractorEmployeeBuilder hoursWorked(int hoursWorked) {
            this.hoursWorked = hoursWorked;
            return this;
        }

        public ContractorEmployeeBuilder hourlyRate(double hourlyRate) {
            this.hourlyRate = hourlyRate;
            return this;
        }

        public ContractorEmployee build() {
            return new ContractorEmployee(this);
        }
    }

    public Double getHourlyRate() {
        return hourlyRate;
    }

    public Integer getHoursWorked() {
        return hoursWorked;
    }
}
