package sg.edu.nus.lapsapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sg.edu.nus.lapsapp.model.LeaveLAPS;

@Repository
public interface LeaveRepo extends JpaRepository<LeaveLAPS, String> {
      
}