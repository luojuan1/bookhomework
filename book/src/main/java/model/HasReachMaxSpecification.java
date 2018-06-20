package model;

public class HasReachMaxSpecification implements ISpecification<Member>{

	@Override
	public boolean IsSatisfiedBy(Member entity) {
		// TODO Auto-generated method stub
		return entity.getLoans().size()>3;
	}
	

}
