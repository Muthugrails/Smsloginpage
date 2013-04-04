
import com.Smsloginpage.Role
import com.Smsloginpage.User
import java.io.ExpiringCache.Entry


class BootStrap {

    def init = { servletContext ->
		
			  def role=new Role(authority:'ADMIN')
			  role.save()
			  def user=new User(username:'muthu', password:'pass', enabled:true)
			  user.save()
			    }
    def destroy = {
    }
}
