package jml2.Task1.EmployeeType;
import jml2.Task1.Annotations.AlwaysPositive;
import jml2.Task1.Annotations.NotNull;
import jml2.Task1.Validators.Validate;

public class FullTimeEmployee extends Employee {
    @NotNull
    @AlwaysPositive
    private Double annualBonus;
    private FullTimeEmployee(FullTimeEmployeeBuilder builder) {
        super(builder);
        this.annualBonus = builder.annualBonus;
        Validate.validate(this);
    }

    public Double getAnnualBonus() {
        return annualBonus;
    }

    public static class FullTimeEmployeeBuilder extends EmployeeBuilder<FullTimeEmployeeBuilder> {
        private Double annualBonus;
        public FullTimeEmployeeBuilder annualBonus(double annualBonus) {
            this.annualBonus = annualBonus;
            return this;
        }
        public FullTimeEmployee build() {
            return new FullTimeEmployee(this);
        }
    }
}
