# Familycloud_2.0
My Family Cloud 2.0
assembly 总装模块：用来控制启动那些模块  
biz 项目业务基础模块  
common 公共模块  用于规范不同项目开发规范的模块，和第三方工具包的引用与封装  
protal 页面模块，用于页面展示业务相关功能  
restful 对外服务接口，采用spring mvc - restful，提供对外接口  
taskscheduling 任务调度模块，用于定时批处理任务  
  
  
引用方式为：  
common<--biz<--restful         |
common<--biz<--protal          | <-- assembly
common<--biz<--taskscheduling  |
