package principles.srp.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * �û���ҵ�����
 */
public interface IUserBO {
    //�����û���ID
    void setUserID(String userID);

    //����û���ID
    String getUserID();

    //�����û�������
    void setPassword(String password);

    //����û�������
    String getPassword();

    //�����û�������
    void setUserName(String userName);

    //����û�������
    String getUserName();
}
