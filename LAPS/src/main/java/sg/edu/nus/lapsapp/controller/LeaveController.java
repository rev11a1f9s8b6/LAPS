package sg.edu.nus.lapsapp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sg.edu.nus.lapsapp.model.LeaveLAPS;
import sg.edu.nus.lapsapp.repo.LeaveRepo;


@Controller
public class LeaveController {

	private LeaveRepo leaveRepo;

	@Autowired
	public void setLeaveRepo(LeaveRepo leaveRepo) {
		this.leaveRepo = leaveRepo;
	}

	@RequestMapping(path = "/")
    public String index() {
        return "index";
	}
	
	//Creating new leave entry
	@RequestMapping(path = "/leave/add", method = RequestMethod.POST)
	public String createLeave(Model model) {
		model.addAttribute("leave", new LeaveLAPS());
	    return "LeaveForm";
	    }
    
	//After keying in
    @RequestMapping(path = "/leave/add", method = RequestMethod.GET)
    public String saveProduct(@Valid LeaveLAPS leave, BindingResult bindingResult) {
    	if (bindingResult.hasErrors()) {
            return "LeaveForm";
        }
        leaveRepo.save(leave);
        return "Leave-Application-History";
    }
    
    
	
        
	
}
