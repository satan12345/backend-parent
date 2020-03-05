package com.mooc.meeting.film.backendfilm.controller;

import com.mooc.meeting.film.backendfilm.service.MoocActorTService;
import com.mooc.meeting.film.backendfilm.vo.DescribeActorsRespVO;
import com.mooc.meeting.film.common.annotation.UseResponseAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 演员表(MoocActorT)表控制层
 *
 * @author makejava
 * @since 2020-03-04 17:05:25
 */
@RestController
@RequestMapping("moocActorT")
@UseResponseAdvice
public class MoocActorTController {
    /**
     * 服务对象
     */
    @Resource
    private MoocActorTService moocActorTService;



//    // 获取电影列表
//    @RequestMapping(value = "",method = RequestMethod.GET)
//    public BaseResponseVO describeFilms(HttpServletRequest request,BasePageVO basePageVO) throws CommonServiceException {
//        // Header信息都打印一下
//        Enumeration<String> headerNames = request.getHeaderNames();
//        while (headerNames.hasMoreElements()){
//            String headName = headerNames.nextElement();
//            log.error("describeFilms - headName:{}, headValue:{}", headName, request.getHeader(headName));
//        }
//
//
//        // 检查入参
//        basePageVO.checkParam();
//
//        // 调用逻辑层，获取返回参数
//        IPage<DescribeFilmsRespVO> results = filmServiceAPI.describeFilms(basePageVO.getNowPage(),basePageVO.getPageSize());
//
//        Map<String, Object> films = descrbePageResult(results, "films");
//
//        return BaseResponseVO.success(films);
//    }


    // 根据电影主键获取电影信息
//    @RequestMapping(value = "/{filmId}",method = RequestMethod.GET)
//    public BaseResponseVO describeFilmById(@PathVariable("filmId")String filmId) throws CommonServiceException {
//
//        DescribeFilmRespVO describeFilmRespVO = filmServiceAPI.describeFilmById(filmId);
//        if(describeFilmRespVO == null){
//            return BaseResponseVO.success();
//        }else{
//            return BaseResponseVO.success(describeFilmRespVO);
//        }
//
//    }
//
//    // 根据电影编号获取电影信息
//    @RequestMapping(value = "/film:add",method = RequestMethod.POST)
//    public BaseResponseVO saveFilmInfo(@RequestBody FilmSavedReqVO filmSavedReqVO) throws CommonServiceException {
//
//        filmServiceAPI.saveFilm(filmSavedReqVO);
//
//        return BaseResponseVO.success();
//    }

//    // 获取分页对象的公共接口
//    private Map<String,Object> descrbePageResult(IPage page, String title){
//        Map<String,Object> result = Maps.newHashMap();
//
//        result.put("totalSize",page.getTotal());
//        result.put("totalPages",page.getPages());
//        result.put("pageSize",page.getSize());
//        result.put("nowPage",page.getCurrent());
//
//        result.put(title, page.getRecords());
//
//        return result;
//    }

}