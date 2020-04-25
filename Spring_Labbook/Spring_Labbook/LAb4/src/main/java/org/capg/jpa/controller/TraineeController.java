package org.capg.jpa.controller;

import org.capg.jpa.entities.Trainee;
import org.capg.jpa.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TraineeController {

	@Autowired
	private TraineeService traineeService;
	
	@RequestMapping("/login")
	public String loginHandler(@RequestParam("uname") String name,@RequestParam("upwd")String pwd) {
		
		if(name.equals("admin") && pwd.equals("123")) {
			return "operation";
		}
		
		return "error";
		
	}
	
	//Adding===========
	@RequestMapping(value ="/addTrainee",method=RequestMethod.GET)
	public String add()
	{
		return "addTrainee";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addtrainee(ModelMap modelmap,@ModelAttribute("trainee") Trainee trainee) {
	       try
	       {
	    	traineeService.newTrainee(trainee);
	         modelmap.addAttribute("msg","Trainee "+trainee.getTraineename()+" added successfuly!");
	       }
	       catch(Exception e)
	       {
	    	   modelmap.addAttribute("mssg","Trainee "+trainee.getTraineeid()+" already exists!" );
	       }
	   return  "addTrainee";}
	
	//Deleting=======
	@RequestMapping(value ="/deletetrainee",method=RequestMethod.GET)
	public String deletetrainee()
	{
		return "deletetrainee";
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	public String deleteById(ModelMap model,@RequestParam("deleteId") int traineeid) {
		model.addAttribute("list",this.traineeService.find(traineeid));
		return "deletetrainee";
	}
	@RequestMapping(value="/deletetrainee/{traineeid}",method=RequestMethod.POST)
	public String delete(ModelMap model,@PathVariable("traineeid") int traineeid) {
		traineeService.delete(traineeid);
		model.addAttribute("msg"," deleted successfuly!");
		return "deletetrainee";
	}
	
	
	//Modify===================
	@RequestMapping(value="/modifytrainee",method=RequestMethod.GET)
	public String modify() {

		return "modifytrainee";
	}
	
	@RequestMapping(value="/modify",method=RequestMethod.POST)
	public String modifyById(ModelMap model,@RequestParam("modifyId") int traineeid) {
		model.addAttribute("list",this.traineeService.find(traineeid));
		return "modifytrainee";
	}
	
	@RequestMapping(value="/modifytrainee",method=RequestMethod.POST)
	public String modify(ModelMap model,@ModelAttribute("trainee") Trainee trainee) {
		traineeService.modify(trainee);
		model.addAttribute("msg","Trainee "+trainee.getTraineeid()+" modified");
		return "modifytrainee";
	}
	

	
	//retrieve===
	@RequestMapping("/retrievetrainee")
	public String retrievetrainee()
	{
		return "retrievetrainee";
	}
	
	@RequestMapping(value="/retrieve",method=RequestMethod.POST)
	public String retrievebyid(ModelMap model,@RequestParam("retrieveId") int traineeid ) {
		
		model.addAttribute("list",this.traineeService.find(traineeid));
		
		return "retrievetrainee";
	}


	
	//retrieveall===============
	@RequestMapping(value="/retrievealltrainee",method=RequestMethod.GET)
		public String retrieveall(ModelMap model) {
			
			model.addAttribute("list", this.traineeService.retrieveAll());
			
			return "retrievealltrainee";
		}

}
