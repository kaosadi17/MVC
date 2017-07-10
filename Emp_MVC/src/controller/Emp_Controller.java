package controller;

import Model.Emp_Model;
import View.Emp_View;

public class Emp_Controller {
	
	private Emp_Model model;
	private Emp_View view;
	
	public Emp_Controller(Emp_Model model, Emp_View view){
		this.model = model;
		this.view = view;
	}
	
	public void setEmpId(String empId){
		model.setEmpId(empId);
	}
	
	public String getEmpId(){
		return model.getEmpId();
	}

	public void setEmpName(String empName){
		model.setEmpName(empName);
	}
	
	public String getEmpName(){
		return model.getEmpName();
	}
	
	public void updateView(){
		view.viewDet(model.getEmpId(), model.getEmpName());
	}
	
	
}
