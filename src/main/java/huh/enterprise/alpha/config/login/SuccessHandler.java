//package huh.enterprise.alpha.config.login;
//
//import org.springframework.security.core.Authentication;
//import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
//import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
//import org.springframework.security.web.savedrequest.RequestCache;
//import org.springframework.security.web.savedrequest.SavedRequest;
//import org.springframework.stereotype.Component;
//import org.springframework.util.StringUtils;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//import static java.util.Objects.isNull;
//
//@Component
//public class SuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
//
//    private RequestCache requestCache = new HttpSessionRequestCache();
//
//    @Override
//    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
//        final SavedRequest savedRequest = requestCache.getRequest(request, response);
//        if (isNull(savedRequest)) {
//            clearAuthenticationAttributes(request);
//            return;
//        }
//        final String targetUrlParameter = getTargetUrlParameter();
//        if (isAlwaysUseDefaultTargetUrl() || (targetUrlParameter != null && StringUtils.hasText(request.getParameter(targetUrlParameter)))) {
//            requestCache.removeRequest(request, response);
//            clearAuthenticationAttributes(request);
//            return;
//        }
//        clearAuthenticationAttributes(request);
//    }
//}
