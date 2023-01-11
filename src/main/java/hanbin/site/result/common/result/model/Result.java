package hanbin.site.result.common.result.model;

import java.io.Serializable;
import lombok.Data;


/**
 * @author hanBinSuper
 */
@Data
public class Result<T> implements Serializable {

    /**
     * 错误码
     */
    private int code;

    /**
     * 提示消息
     */
    private String msg;

    /**
     * 返回的数据体
     */
    private T data;

    private String time;

}
