import os
import argparse
from datetime import date

def create_solution_file(title, url, difficulty, tags, lang="py", status="Solved"):
    today = date.today().isoformat()
    folder = difficulty.lower()
    os.makedirs(folder, exist_ok=True)

    # File name = title with underscores
    file_name = title.lower().replace(" ", "_") + f".{lang}"
    file_path = os.path.join(folder, file_name)

    # Starter code template
    content = f"""# Problem: {title}
# Link: {url}
# Difficulty: {difficulty}
# Tags: {tags}
# Date: {today}
# Status: {status}

class Solution:
    def solve(self):
        pass
"""

    # Write solution file
    with open(file_path, "w") as f:
        f.write(content)

    print(f"✅ Created {file_path}")

    # Update README
    row = f"| {today} | [{title}]({url}) | {difficulty} | {tags} | {status} | [code]({folder}/{file_name}) |\n"

    with open("README.md", "a") as f:
        f.write(row)

    print("📘 Updated README.md")

if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--title", required=True, help="Problem title")
    parser.add_argument("--url", required=True, help="Problem link")
    parser.add_argument("--difficulty", required=True, choices=["Easy", "Medium", "Hard"])
    parser.add_argument("--tags", default="", help="Comma separated tags")
    parser.add_argument("--lang", default="py", help="File extension (py, java, cpp, etc.)")
    parser.add_argument("--status", default="Solved", help="Solved/In Progress")
    args = parser.parse_args()

    create_solution_file(args.title, args.url, args.difficulty, args.tags, args.lang, args.status)
