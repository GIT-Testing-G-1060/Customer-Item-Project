/*
 *  * ------------------------------------------------------------------------------------------------------------------
 *  *  *  Copyright (c) Customer Item Project. All rights reserved.
 *  *  *  Licensed under the SriLankan Information License. See License.txt in the project root for license information.
 *  * ------------------------------------------------------------------------------------------------------------------
 */
/*
 * @author Mindula Dilthushan <minduladilthushan1@gmail.com>
 * @since 10/09/2021
 */
package bo;

import bo.custom.impl.*;

public class BOFactory {

    private static BOFactory boFactory;
    private BOFactory(){

    }
    public static BOFactory getInstance(){
        return (boFactory == null) ?
                (boFactory = new BOFactory()) : (boFactory);
    }
    public enum BOType {
        CUSTOMER
    }
    public <T> T getBO(BOType boType){
        switch (boType) {
            case CUSTOMER:
                return (T) new CustomerBOImpl();

            default:
                return null;
        }
    }

}
