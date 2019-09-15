/**
 * @author https://www.chuckfang.top
 * @date Created on 2019/8/29 12:08
 */
public enum OrderStateMachine {

    /**
     * 调度中
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
     * 派送中
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
     * 已经收货
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
     * 下一个状态
     * @return the state machine
     */
    public abstract OrderStateMachine nextState();

    /**
     * 上一个状态
     * @return the state machine
     */
    public abstract OrderStateMachine prevState();

}
