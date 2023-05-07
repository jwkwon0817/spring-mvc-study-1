package com.codemos.servletstudy.web.frontcontroller.v3;

import com.codemos.servletstudy.web.frontcontroller.ModelView;

import java.util.Map;

public interface ControllerV3 {
	ModelView process(Map<String, String> paramMap);
}
