package hanbin.site.result.common.exception;

import hanbin.site.result.common.result.enums.ResultEnum;

/**
 * @author hanbin
 */
public class ApiException extends BaseException {
    public ApiException(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ApiException(String msg) {
        this.code = ResultEnum.FAIL.getCode();
        this.msg = msg;
    }

    public ApiException() {
    }
}
