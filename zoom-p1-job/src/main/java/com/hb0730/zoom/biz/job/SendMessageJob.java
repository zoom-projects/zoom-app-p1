package com.hb0730.zoom.biz.job;

import com.hb0730.zoom.base.ext.services.proxy.SysProxyService;
import lombok.extern.slf4j.Slf4j;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;

/**
 * @author <a href="mailto:huangbing0730@gmail">hb0730</a>
 * @date 2024/10/19
 */
@Slf4j
@DisallowConcurrentExecution
public class SendMessageJob implements Job {
    @Autowired
    private SysProxyService messageService;

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        log.info("发送消息任务 SendMessageJob !");
        messageService.doSendMessages(Collections.emptyMap());
    }
}
