package principles.srp.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * �û���Ϣ����
 */
public interface IUserBiz {

    //�޸��û�������
    boolean changePassword(String oldPassword);

    //ɾ���û�
    boolean deleteUser();

    //�û�ӳ��
    void mapUser();

    //����һ����֯
    void addOrg(IUserBO userBO, int orgID);

    //����һ����ɫ
    void addRole(IUserBO userBO, int roleID);
}
