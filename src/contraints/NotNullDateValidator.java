package contraints;

import java.sql.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NotNullDateValidator implements ConstraintValidator<NotNullDate, Date> {

	@Override
	public void initialize(NotNullDate arg0) {
	}

	@Override
	public boolean isValid(Date date, ConstraintValidatorContext ctx) {
		if (date == null)
			return false;
		return true;
	}

}
