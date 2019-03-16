import com.yela.SpringWebApplication;
import com.yela.controller.RestHelloWorldController;
import com.yela.mapper.MessageRepository;
import com.yela.model.Message;
import com.yela.model.Response;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringWebApplication.class)
public class RestHelloWorldControllerTest {

    @Autowired
    MessageRepository messageRepository;

    Message testMessage = new Message(1,"test");

    public void changeData(){

        Response response = new Response("Done", messageRepository.update(testMessage));

    }

    @Autowired
    private RestHelloWorldController restHelloWorldController;

    @Test
    public void testGetResource() {

        changeData();

        Response testingResponse = restHelloWorldController.getResource();

        Assert.assertEquals(testMessage.getMessage(), testingResponse.getData());

    }

}
