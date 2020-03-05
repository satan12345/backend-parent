package com.mooc.meeting.film.backendfilm.controller;

import com.mooc.meeting.film.backendfilm.controller.vo.FilmSavedReqVO;
import com.mooc.meeting.film.backendfilm.entity.MoocFilmT;
import com.mooc.meeting.film.backendfilm.service.MoocFilmTService;
import com.mooc.meeting.film.backendfilm.vo.DescribeActorsRespVO;
import com.mooc.meeting.film.backendfilm.vo.DescribeFilmRespVO;
import com.mooc.meeting.film.backendfilm.vo.DescribeFilmsRespVO;
import com.mooc.meeting.film.common.annotation.UseResponseAdvice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.List;

/**
 * 影片主表(MoocFilmT)表控制层
 *
 * @author makejava
 * @since 2020-03-04 17:00:25
 */
@RestController
@UseResponseAdvice
@RequestMapping("moocFilmT")
@Slf4j
public class MoocFilmTController {
    /**
     * 服务对象
     */
    @Resource
    private MoocFilmTService moocFilmTService;


    // 获取演员列表
    @RequestMapping(value = "/actors", method = RequestMethod.GET)
    public List<DescribeActorsRespVO> describeActors(Integer pageSize, Integer pageNo) {


        // 调用逻辑层，获取返回参数
        List<DescribeActorsRespVO> results = moocFilmTService.describeActors(pageNo, pageSize);

        //  Map<String, Object> actors = descrbePageResult(results, "actors");
        return results;
        // return BaseResponseVO.success(actors);
    }

        // 获取电影列表
    @RequestMapping(value = "",method = RequestMethod.GET)
    public List<DescribeFilmsRespVO> describeFilms(HttpServletRequest request,
                                                  Integer pageSize, Integer pageNo)  {
        // Header信息都打印一下
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()){
            String headName = headerNames.nextElement();
            log.error("describeFilms - headName:{}, headValue:{}", headName, request.getHeader(headName));
        }


//        // 检查入参
//        basePageVO.checkParam();

        // 调用逻辑层，获取返回参数
        List<DescribeFilmsRespVO> results = moocFilmTService.describeFilms(pageNo,pageSize);


        return results;
    }

    // 根据电影主键获取电影信息
    @RequestMapping(value = "/{filmId}",method = RequestMethod.GET)
    public DescribeFilmRespVO describeFilmById(@PathVariable("filmId")String filmId){

        DescribeFilmRespVO describeFilmRespVO = moocFilmTService.describeFilmById(filmId);
        return describeFilmRespVO;
    }



    // 根据电影编号获取电影信息
    @RequestMapping(value = "/film/add",method = RequestMethod.POST)
    public Integer saveFilmInfo(@RequestBody FilmSavedReqVO filmSavedReqVO){

        Integer id=moocFilmTService.saveFilm(filmSavedReqVO);

        return id;
    }

}