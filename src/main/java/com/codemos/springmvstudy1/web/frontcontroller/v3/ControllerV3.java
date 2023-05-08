package com.codemos.springmvstudy1.web.frontcontroller.v3;

import com.codemos.springmvstudy1.web.frontcontroller.ModelView;

import java.util.Map;

public interface ControllerV3 {
	ModelView process(Map<String, String> paramMap);
}
