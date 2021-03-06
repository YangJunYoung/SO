package com.pineone.icbms.so.contextmodel.ref;

import com.pineone.icbms.so.contextmodel.entity.ContextModel;
import com.pineone.icbms.so.util.exception.DataLossException;

/**
 * Created by melvin on 2016. 8. 9..
 */
public class DataValidation {

    public static DataValidation newDataValidation(){
        DataValidation dataValidation = new DataValidation();
        return dataValidation;
    }

    //NOTE : ContextModel 데이터 검증
    public void inspectContextModel(ContextModel contextModel) throws DataLossException {
        //
        if(contextModel.getId() == null || contextModel.getContextType() == null ||
                contextModel.getDomainIdList() == null){
            throw new DataLossException();
        }
    }

}
