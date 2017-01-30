import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
 
public class StatsFilter implements Filter
{
    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
            throws IOException, ServletException
    {
        // hmm... so what do I do?
        chain.doFilter(req, res);
    }
 
    @Override
    public void destroy()
    {
    }
 
    @Override
    public void init(FilterConfig config) throws ServletException
    {
    }
}
