package constants;

public final class FrameworkConstants { /* we have created this class as final because this prevents anyone from extending the class
since it only contains inheritance doesn't make any sense*/

    //private object creation
    private FrameworkConstants(){ //it is a private constructor
    }
    //configuration file
    public static final String CONFIG_FILE_PATH =
            "src/main/resources/config.properties";

    //property keys
    public static final String BASE_URL_KEY = "baseurl";
    public static final String CONNECT_TIMEOUT_KEY = "connectTimeout";
    public static final String READ_TIMEOUT_KEY = "readTimeout";
    public static final String REPORT_PATH_KEY="reportpath";
    public static final String LOG_PATH_KEY = "logpath";

    //HTTP status code
    public static final int SUCCESS_STATUS_CODE = 200;
    public static final int STATUS_CODE_201 = 201;
    public static final int STATUS_CODE_400 = 400;
    public static final int STATUS_CODE_404 = 404;
    public static final int STATUS_CODE_500 = 500;

}