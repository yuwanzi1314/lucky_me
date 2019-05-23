package com.llh.lucky_me.modle.component.prize;

import java.util.LinkedList;
import java.util.List;

public enum RmfEnum {
    A {
        @Override
        public List<PrizeBO> getList() {
            List<PrizeBO> list = new LinkedList<PrizeBO>();

            PrizeBO prizeDJQ = new PrizeBO();
            prizeDJQ.setCode(11);
            prizeDJQ.setProd(0.1D);
            prizeDJQ.setIsNumberLimit(true);
            prizeDJQ.setNumber(2);//150
            list.add(prizeDJQ);

            PrizeBO prizeDXYS = new PrizeBO();
            prizeDXYS.setCode(12);
            prizeDXYS.setProd(0.15D);
            prizeDXYS.setIsNumberLimit(false);
            list.add(prizeDXYS);

            PrizeBO prizeTJQ = new PrizeBO();
            prizeTJQ.setCode(13);
            prizeTJQ.setProd(0.15D);
            prizeTJQ.setIsNumberLimit(false);
            list.add(prizeTJQ);

            PrizeBO prizeCKQ = new PrizeBO();
            prizeCKQ.setCode(14);
            prizeCKQ.setProd(0.15D);
            prizeCKQ.setIsNumberLimit(false);
            list.add(prizeCKQ);

            PrizeBO prizeZX = new PrizeBO();
            prizeZX.setCode(15);
            prizeZX.setProd(0.25D);
            prizeZX.setIsNumberLimit(false);
            list.add(prizeZX);

            PrizeBO prizeXXHG = new PrizeBO();
            prizeXXHG.setCode(0);
            prizeXXHG.setProd(0.2D);
            prizeXXHG.setIsNumberLimit(false);
            list.add(prizeXXHG);

            return list;
        }

        ;
    },
    B {
        @Override
        public List<PrizeBO> getList() {
            List<PrizeBO> list = new LinkedList<PrizeBO>();

            PrizeBO prizeDJQ = new PrizeBO();
            prizeDJQ.setCode(11);
            prizeDJQ.setProd(0.1D);
            prizeDJQ.setIsNumberLimit(true);
            prizeDJQ.setNumber(2);//120
            list.add(prizeDJQ);

            PrizeBO prizeDXYS = new PrizeBO();
            prizeDXYS.setCode(12);
            prizeDXYS.setProd(0.1D);
            prizeDXYS.setIsNumberLimit(false);
            list.add(prizeDXYS);

            PrizeBO prizeTJQ = new PrizeBO();
            prizeTJQ.setCode(13);
            prizeTJQ.setProd(0.15D);
            prizeTJQ.setIsNumberLimit(false);
            list.add(prizeTJQ);

            PrizeBO prizeCKQ = new PrizeBO();
            prizeCKQ.setCode(14);
            prizeCKQ.setProd(0.1D);
            prizeCKQ.setIsNumberLimit(false);
            list.add(prizeCKQ);

            PrizeBO prizeZX = new PrizeBO();
            prizeZX.setCode(15);
            prizeZX.setProd(0.25D);
            prizeZX.setIsNumberLimit(false);
            list.add(prizeZX);

            PrizeBO prizeXXHG = new PrizeBO();
            prizeXXHG.setCode(0);
            prizeXXHG.setProd(0.3D);
            prizeXXHG.setIsNumberLimit(false);
            list.add(prizeXXHG);

            return list;
        }

        ;
    };


    public abstract List<PrizeBO> getList();
}
