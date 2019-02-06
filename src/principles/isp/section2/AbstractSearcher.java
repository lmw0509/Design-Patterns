package principles.isp.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ��̽��������Ů
 */
public abstract class AbstractSearcher {
    IGoodBodyGirl goodBodyGirl;
    IGreatTemperamentGirl greatTemperamentGirl;

    //����������Ů
    AbstractSearcher(IGoodBodyGirl _goodBodyGirl) {
        this.goodBodyGirl = _goodBodyGirl;
    }

    //����������Ů
    AbstractSearcher(IGreatTemperamentGirl _gretTemperamentGirl) {
        this.greatTemperamentGirl = _gretTemperamentGirl;
    }

    //������Ů���г���Ů��Ϣ
    public abstract void show();
}
