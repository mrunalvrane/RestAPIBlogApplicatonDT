package com.codewithdurgesh.blog.payloads;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//created custom API response class

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse {
private String message;
private boolean success;
}
