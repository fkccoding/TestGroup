/**
 * @author https://www.chuckfang.top
 * @date Created on 2019/8/29 12:08
 */
public enum OrderStateMachine {

    /**
     * ������
     */
    DISPATCHING{
        @Override
        public OrderStateMachine nextState(){
            return DELOVERING;
        }

        @Override
        public OrderStateMachine prevState(){
            return this;
        }

    },

    /**
     * ������
     */
    DELOVERING{
        @Override
        public OrderStateMachine nextState(){
            return RECEIVED;
        }

        @Override
        public OrderStateMachine prevState(){
            return DISPATCHING;
        }

    },

    /**
     * �Ѿ��ջ�
     */
    RECEIVED{
        @Override
        public OrderStateMachine nextState(){
            return RECEIVED;
        }

        @Override
        public OrderStateMachine prevState(){
            return DELOVERING;
        }

    };

    /**
     * ��һ��״̬
     * @return the state machine
     */
    public abstract OrderStateMachine nextState();

    /**
     * ��һ��״̬
     * @return the state machine
     */
    public abstract OrderStateMachine prevState();

}
