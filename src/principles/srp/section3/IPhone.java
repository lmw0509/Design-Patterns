package principles.srp.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * �绰�Ľӿ�
 */
public interface IPhone {

    //��ͨ�绰
    void dial(String phoneNumber);

    //ͨ��
    void call(Object o);

    //��Ӧ��ֻ���Լ�˵����û�л�Ӧ������ɶ����
    void answer(Object o);

    //ͨ����ϣ��ҵ绰
    void huangup();
}
