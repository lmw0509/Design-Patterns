package patterns.proxy.section8;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ������
 */
public class GamePlayerProxy implements IGamePlayer,IProxy {
	private IGamePlayer gamePlayer = null;
	
	//ͨ�����캯������Ҫ��˭���д���
	public GamePlayerProxy(IGamePlayer _gamePlayer){
		this.gamePlayer = _gamePlayer;
	}
	
	//����ɱ��
	public void killBoss() {
		this.gamePlayer.killBoss();
	}

	//������¼
	public void login(String user, String password) {
		this.gamePlayer.login(user, password);

	}

	//��������
	public void upgrade() {
		this.gamePlayer.upgrade();
		this.count();
	}
	
	//�������
	public void count(){
		System.out.println("�����ܷ����ǣ�150Ԫ");
	}
}