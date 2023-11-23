package com.study.programmers.kakao;

import java.util.*;

public class ReportSolution {
	public static int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length];
		Map<String, HashSet<String>> reportMemberList = new HashMap<>();
		Map<String, Integer> mailCount = new HashMap<>();
		
		for (String id : id_list) {
			mailCount.put(id, 0);
			reportMemberList.put(id, new HashSet<>());
		}
		
		for(String rep : report) {
			String tempList[] = rep.split(" ");
			String reporter = tempList[0];
			String recipient = tempList[1];
			reportMemberList.get(recipient).add(reporter);
		}
		
		for(String key : reportMemberList.keySet()) {
			HashSet<String> reportSet = reportMemberList.get(key);
			if(reportSet.size() >= k) {
				for(String user : reportSet) {
					Integer num = mailCount.get(user);
					mailCount.put(user, num+1);
				}
			}
			
		}
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = mailCount.get(id_list[i]);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		String[] id_list = { "muzi", "frodo", "apeach", "neo" };
		String[] report = { "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi" };

		int k = 2;

		for (int i : solution(id_list, report, k)) {
			System.out.println(i + " ");
		}
	}
}