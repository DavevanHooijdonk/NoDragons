package com.brocoding.nodragons.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "The Monster Template is not valid")
public class InvalidTemplateException extends RuntimeException
{
}
